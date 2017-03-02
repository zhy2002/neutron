package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.PlanNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PlanNodeModule_ProvidePlanNodeFactory implements Factory<PlanNode> {
  private final PlanNodeModule module;

  public PlanNodeModule_ProvidePlanNodeFactory(PlanNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PlanNode get() {
    return Preconditions.checkNotNull(
        module.providePlanNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PlanNode> create(PlanNodeModule module) {
    return new PlanNodeModule_ProvidePlanNodeFactory(module);
  }

  /** Proxies {@link PlanNodeModule#providePlanNode()}. */
  public static PlanNode proxyProvidePlanNode(PlanNodeModule instance) {
    return instance.providePlanNode();
  }
}
