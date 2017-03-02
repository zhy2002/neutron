package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final PreviousEmploymentListNodeModule module;

  public PreviousEmploymentListNodeModule_ProvideListUiNodeFactory(
      PreviousEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(PreviousEmploymentListNodeModule module) {
    return new PreviousEmploymentListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(PreviousEmploymentListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
