package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final SelectRelatedPersonNodeModule module;

  public SelectRelatedPersonNodeModule_ProvideParentUiNodeFactory(
      SelectRelatedPersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(SelectRelatedPersonNodeModule module) {
    return new SelectRelatedPersonNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link SelectRelatedPersonNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(SelectRelatedPersonNodeModule instance) {
    return instance.provideParentUiNode();
  }
}