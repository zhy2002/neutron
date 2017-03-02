package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final PayeEmployedNodeModule module;

  public PayeEmployedNodeModule_ProvideParentUiNodeFactory(PayeEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(PayeEmployedNodeModule module) {
    return new PayeEmployedNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link PayeEmployedNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(PayeEmployedNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
