package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseOtherIncomeListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonOtherIncomeListNodeModule_ProvideBaseOtherIncomeListNodeFactory
    implements Factory<BaseOtherIncomeListNode<?>> {
  private final PersonOtherIncomeListNodeModule module;

  public PersonOtherIncomeListNodeModule_ProvideBaseOtherIncomeListNodeFactory(
      PersonOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseOtherIncomeListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseOtherIncomeListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseOtherIncomeListNode<?>> create(PersonOtherIncomeListNodeModule module) {
    return new PersonOtherIncomeListNodeModule_ProvideBaseOtherIncomeListNodeFactory(module);
  }

  /** Proxies {@link PersonOtherIncomeListNodeModule#provideBaseOtherIncomeListNode()}. */
  public static BaseOtherIncomeListNode<?> proxyProvideBaseOtherIncomeListNode(
      PersonOtherIncomeListNodeModule instance) {
    return instance.provideBaseOtherIncomeListNode();
  }
}
