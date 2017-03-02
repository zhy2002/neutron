package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentTypeNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final EmploymentTypeNodeModule module;

  public EmploymentTypeNodeModule_ProvideStringUiNodeFactory(EmploymentTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(EmploymentTypeNodeModule module) {
    return new EmploymentTypeNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentTypeNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(EmploymentTypeNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
