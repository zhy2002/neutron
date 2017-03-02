package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonOtherIncomeListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final PersonOtherIncomeListNodeModule module;

  public PersonOtherIncomeListNodeModule_ProvideParentUiNodeFactory(
      PersonOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(PersonOtherIncomeListNodeModule module) {
    return new PersonOtherIncomeListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link PersonOtherIncomeListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(PersonOtherIncomeListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
