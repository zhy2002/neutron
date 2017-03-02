package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final EmploymentTypeNodeModule module;

  public EmploymentTypeNodeModule_ProvideLeafUiNodeFactory(EmploymentTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(EmploymentTypeNodeModule module) {
    return new EmploymentTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(EmploymentTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
