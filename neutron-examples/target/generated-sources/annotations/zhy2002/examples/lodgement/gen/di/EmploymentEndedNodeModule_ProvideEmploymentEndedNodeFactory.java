package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmploymentEndedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNodeModule_ProvideEmploymentEndedNodeFactory
    implements Factory<EmploymentEndedNode> {
  private final EmploymentEndedNodeModule module;

  public EmploymentEndedNodeModule_ProvideEmploymentEndedNodeFactory(
      EmploymentEndedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmploymentEndedNode get() {
    return Preconditions.checkNotNull(
        module.provideEmploymentEndedNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmploymentEndedNode> create(EmploymentEndedNodeModule module) {
    return new EmploymentEndedNodeModule_ProvideEmploymentEndedNodeFactory(module);
  }

  /** Proxies {@link EmploymentEndedNodeModule#provideEmploymentEndedNode()}. */
  public static EmploymentEndedNode proxyProvideEmploymentEndedNode(
      EmploymentEndedNodeModule instance) {
    return instance.provideEmploymentEndedNode();
  }
}
