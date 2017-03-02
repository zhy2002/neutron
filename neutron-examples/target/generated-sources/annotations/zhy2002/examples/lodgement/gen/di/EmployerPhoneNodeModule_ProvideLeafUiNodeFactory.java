package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerPhoneNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final EmployerPhoneNodeModule module;

  public EmployerPhoneNodeModule_ProvideLeafUiNodeFactory(EmployerPhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(EmployerPhoneNodeModule module) {
    return new EmployerPhoneNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link EmployerPhoneNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(EmployerPhoneNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
