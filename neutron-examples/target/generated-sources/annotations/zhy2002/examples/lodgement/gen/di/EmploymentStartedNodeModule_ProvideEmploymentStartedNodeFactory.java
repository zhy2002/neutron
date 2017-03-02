package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmploymentStartedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStartedNodeModule_ProvideEmploymentStartedNodeFactory
    implements Factory<EmploymentStartedNode> {
  private final EmploymentStartedNodeModule module;

  public EmploymentStartedNodeModule_ProvideEmploymentStartedNodeFactory(
      EmploymentStartedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmploymentStartedNode get() {
    return Preconditions.checkNotNull(
        module.provideEmploymentStartedNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmploymentStartedNode> create(EmploymentStartedNodeModule module) {
    return new EmploymentStartedNodeModule_ProvideEmploymentStartedNodeFactory(module);
  }

  /** Proxies {@link EmploymentStartedNodeModule#provideEmploymentStartedNode()}. */
  public static EmploymentStartedNode proxyProvideEmploymentStartedNode(
      EmploymentStartedNodeModule instance) {
    return instance.provideEmploymentStartedNode();
  }
}
