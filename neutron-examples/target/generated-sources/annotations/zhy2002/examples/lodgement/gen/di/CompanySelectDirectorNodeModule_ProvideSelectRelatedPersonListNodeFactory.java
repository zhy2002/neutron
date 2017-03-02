package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectDirectorNodeModule_ProvideSelectRelatedPersonListNodeFactory
    implements Factory<SelectRelatedPersonListNode<?>> {
  private final CompanySelectDirectorNodeModule module;

  public CompanySelectDirectorNodeModule_ProvideSelectRelatedPersonListNodeFactory(
      CompanySelectDirectorNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectRelatedPersonListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideSelectRelatedPersonListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectRelatedPersonListNode<?>> create(
      CompanySelectDirectorNodeModule module) {
    return new CompanySelectDirectorNodeModule_ProvideSelectRelatedPersonListNodeFactory(module);
  }

  /** Proxies {@link CompanySelectDirectorNodeModule#provideSelectRelatedPersonListNode()}. */
  public static SelectRelatedPersonListNode<?> proxyProvideSelectRelatedPersonListNode(
      CompanySelectDirectorNodeModule instance) {
    return instance.provideSelectRelatedPersonListNode();
  }
}
