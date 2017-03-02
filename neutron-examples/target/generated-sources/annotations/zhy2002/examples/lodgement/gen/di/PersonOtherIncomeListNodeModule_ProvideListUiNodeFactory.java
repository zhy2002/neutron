package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonOtherIncomeListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final PersonOtherIncomeListNodeModule module;

  public PersonOtherIncomeListNodeModule_ProvideListUiNodeFactory(
      PersonOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(PersonOtherIncomeListNodeModule module) {
    return new PersonOtherIncomeListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link PersonOtherIncomeListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(PersonOtherIncomeListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
