package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final RelatedPartyNodeModule module;

  public RelatedPartyNodeModule_ProvideUiNodeFactory(RelatedPartyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(RelatedPartyNodeModule module) {
    return new RelatedPartyNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link RelatedPartyNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(RelatedPartyNodeModule instance) {
    return instance.provideUiNode();
  }
}
