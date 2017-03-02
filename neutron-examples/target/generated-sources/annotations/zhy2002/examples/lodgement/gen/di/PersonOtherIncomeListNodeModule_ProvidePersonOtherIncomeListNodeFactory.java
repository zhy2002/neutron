package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonOtherIncomeListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonOtherIncomeListNodeModule_ProvidePersonOtherIncomeListNodeFactory
    implements Factory<PersonOtherIncomeListNode> {
  private final PersonOtherIncomeListNodeModule module;

  public PersonOtherIncomeListNodeModule_ProvidePersonOtherIncomeListNodeFactory(
      PersonOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonOtherIncomeListNode get() {
    return Preconditions.checkNotNull(
        module.providePersonOtherIncomeListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonOtherIncomeListNode> create(PersonOtherIncomeListNodeModule module) {
    return new PersonOtherIncomeListNodeModule_ProvidePersonOtherIncomeListNodeFactory(module);
  }

  /** Proxies {@link PersonOtherIncomeListNodeModule#providePersonOtherIncomeListNode()}. */
  public static PersonOtherIncomeListNode proxyProvidePersonOtherIncomeListNode(
      PersonOtherIncomeListNodeModule instance) {
    return instance.providePersonOtherIncomeListNode();
  }
}
