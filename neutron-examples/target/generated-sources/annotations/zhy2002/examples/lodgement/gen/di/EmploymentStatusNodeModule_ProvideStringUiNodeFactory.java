package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStatusNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final EmploymentStatusNodeModule module;

  public EmploymentStatusNodeModule_ProvideStringUiNodeFactory(EmploymentStatusNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(EmploymentStatusNodeModule module) {
    return new EmploymentStatusNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentStatusNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(EmploymentStatusNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
