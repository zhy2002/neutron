package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final RelatedPartyListNodeModule module;

  public RelatedPartyListNodeModule_ProvideUiNodeFactory(RelatedPartyListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(RelatedPartyListNodeModule module) {
    return new RelatedPartyListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link RelatedPartyListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(RelatedPartyListNodeModule instance) {
    return instance.provideUiNode();
  }
}
