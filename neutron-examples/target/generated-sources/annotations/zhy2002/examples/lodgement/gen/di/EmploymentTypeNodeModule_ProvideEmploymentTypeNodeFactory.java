package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmploymentTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentTypeNodeModule_ProvideEmploymentTypeNodeFactory
    implements Factory<EmploymentTypeNode> {
  private final EmploymentTypeNodeModule module;

  public EmploymentTypeNodeModule_ProvideEmploymentTypeNodeFactory(
      EmploymentTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmploymentTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideEmploymentTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmploymentTypeNode> create(EmploymentTypeNodeModule module) {
    return new EmploymentTypeNodeModule_ProvideEmploymentTypeNodeFactory(module);
  }

  /** Proxies {@link EmploymentTypeNodeModule#provideEmploymentTypeNode()}. */
  public static EmploymentTypeNode proxyProvideEmploymentTypeNode(
      EmploymentTypeNodeModule instance) {
    return instance.provideEmploymentTypeNode();
  }
}
