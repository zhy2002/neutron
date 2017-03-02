package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmploymentStatusNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStatusNodeModule_ProvideEmploymentStatusNodeFactory
    implements Factory<EmploymentStatusNode> {
  private final EmploymentStatusNodeModule module;

  public EmploymentStatusNodeModule_ProvideEmploymentStatusNodeFactory(
      EmploymentStatusNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmploymentStatusNode get() {
    return Preconditions.checkNotNull(
        module.provideEmploymentStatusNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmploymentStatusNode> create(EmploymentStatusNodeModule module) {
    return new EmploymentStatusNodeModule_ProvideEmploymentStatusNodeFactory(module);
  }

  /** Proxies {@link EmploymentStatusNodeModule#provideEmploymentStatusNode()}. */
  public static EmploymentStatusNode proxyProvideEmploymentStatusNode(
      EmploymentStatusNodeModule instance) {
    return instance.provideEmploymentStatusNode();
  }
}
