package org.antlr.sql.dialects;

import java.util.Collections;
import java.util.List;

import org.antlr.sql.dialects.rules.CommonRules;
import org.antlr.sql.models.AntlrContext;
import org.sonarsource.plugins.mybatis.rules.Rule;
import org.sonarsource.plugins.mybatis.rules.SqlRules;

public enum Dialects {
    TSQL(new TSQLDialect()), PSSQL(new PsSqlDialect()), MYSQL(new MySqlDialect()), VSQL(new VSQLDialect());

    public AntlrContext parse(String text) {
        return parse(text, Collections.emptyList());
    }

    public AntlrContext parse(String text, List<SqlRules> rules) {
        AntlrContext ctx = this.dialect.parse(text);
        ctx.initialContents = text;
        SQLDialectRules.INSTANCE.getRules().forEach(r -> {
            if (r.getDialect() == null || this.name().equalsIgnoreCase(r.getDialect())) {
                ctx.rules.add(r);
            }

        });

        rules.forEach(r -> {
            if (r.getDialect() == null || this.name().equalsIgnoreCase(r.getDialect())) {
                ctx.rules.add(r);
            }
        });
        ctx.rules.addAll(CommonRules.INSTANCE.getRules());

        return ctx;
    }

    private final IDialect dialect;

    private Dialects(IDialect dialect) {
        this.dialect = dialect;
    }
}