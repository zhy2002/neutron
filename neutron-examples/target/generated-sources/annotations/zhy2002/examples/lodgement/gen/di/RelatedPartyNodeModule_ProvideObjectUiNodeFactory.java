package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final RelatedPartyNodeModule module;

  public RelatedPartyNodeModule_ProvideObjectUiNodeFactory(RelatedPartyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(RelatedPartyNodeModule module) {
    return new RelatedPartyNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link RelatedPartyNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(RelatedPartyNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
