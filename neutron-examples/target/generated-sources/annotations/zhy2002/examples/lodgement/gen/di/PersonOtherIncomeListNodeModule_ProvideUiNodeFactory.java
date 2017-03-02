package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonOtherIncomeListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final PersonOtherIncomeListNodeModule module;

  public PersonOtherIncomeListNodeModule_ProvideUiNodeFactory(
      PersonOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PersonOtherIncomeListNodeModule module) {
    return new PersonOtherIncomeListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PersonOtherIncomeListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PersonOtherIncomeListNodeModule instance) {
    return instance.provideUiNode();
  }
}
