package zhy2002.neutron;

public enum CycleModeEnum {

    /**
     * trigger a cycle when a root change happens.
     */
    Auto,
    /**
     * queue up all root changes until a cycle is processed manually.
     */
    Batched
}
