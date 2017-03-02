package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final OtherLiabilityNodeModule module;

  public OtherLiabilityNodeModule_ProvideObjectUiNodeFactory(OtherLiabilityNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(OtherLiabilityNodeModule module) {
    return new OtherLiabilityNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(OtherLiabilityNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
