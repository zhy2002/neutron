package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonHomePhoneNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PersonHomePhoneNodeModule module;

  public PersonHomePhoneNodeModule_ProvideUiNodeFactory(PersonHomePhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PersonHomePhoneNodeModule module) {
    return new PersonHomePhoneNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PersonHomePhoneNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PersonHomePhoneNodeModule instance) {
    return instance.provideUiNode();
  }
}
