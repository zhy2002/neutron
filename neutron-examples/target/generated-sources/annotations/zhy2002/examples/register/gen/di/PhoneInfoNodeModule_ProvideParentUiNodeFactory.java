package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final PhoneInfoNodeModule module;

  public PhoneInfoNodeModule_ProvideParentUiNodeFactory(PhoneInfoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(PhoneInfoNodeModule module) {
    return new PhoneInfoNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link PhoneInfoNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(PhoneInfoNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
