package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final CurrentEmploymentListNodeModule module;

  public CurrentEmploymentListNodeModule_ProvideListUiNodeFactory(
      CurrentEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(CurrentEmploymentListNodeModule module) {
    return new CurrentEmploymentListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link CurrentEmploymentListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(CurrentEmploymentListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
