package org.antlr.sql.sca.matchers;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonarsource.plugins.mybatis.rules.RuleDistanceIndexMatchType;
import org.sonarsource.plugins.mybatis.rules.RuleImplementation;

public class IndexMatcher implements IMatcher {

    @Override
    public boolean match(IParsedNode node, RuleImplementation rule) {
        if (rule.getIndex() == 0) {
            return true;
        }
        if (rule.getIndex() > 0) {
            int val = node.getIndex();
            if (val == 0) {
                val = node.getGlobalIndex();
            }
            if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.LESS) {
                if (val > rule.getIndex()) {
                    return false;
                }
            }
            if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.EQUALS) {
                if (val != rule.getIndex()) {
                    return false;
                }
            }
            if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.MORE) {
                if (rule.getIndex() < val) {
                    return false;
                }
            }

        }
        if (rule.getIndex() < 0) {
            int val = node.getIndex2();
            if (val == 0) {
                val = node.getGlobalIndex();
            }
            if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.LESS) {
                if (val > rule.getIndex()) {
                    return false;
                }
            }
            if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.EQUALS) {
                if (val != rule.getIndex()) {
                    return false;
                }
            }
            if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.MORE) {
                if (rule.getIndex() < val) {
                    return false;
                }
            }

        }
        return true;
    }

}
