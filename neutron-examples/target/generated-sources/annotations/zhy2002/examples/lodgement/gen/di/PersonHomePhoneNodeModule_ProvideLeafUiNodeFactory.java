package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonHomePhoneNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final PersonHomePhoneNodeModule module;

  public PersonHomePhoneNodeModule_ProvideLeafUiNodeFactory(PersonHomePhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(PersonHomePhoneNodeModule module) {
    return new PersonHomePhoneNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link PersonHomePhoneNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(PersonHomePhoneNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
