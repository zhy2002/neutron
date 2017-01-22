package zhy2002.neutron.util;

import zhy2002.neutron.UniqueIdGenerator;

/**
 * A stub unique id generator to getUiNodeRuleFactory thing running.
 */
public class SequentialUniqueIdGenerator implements UniqueIdGenerator {

    private long uniqueIdSequenceNumber = 0;

    /**
     * Caller should not utilize the sequential nature of the ids in any way.
     *
     * @return the only promise is each return value is different.
     */
    public String next() {
        return String.valueOf(uniqueIdSequenceNumber++); //DO NOT rely on this implementation detail
    }

}
