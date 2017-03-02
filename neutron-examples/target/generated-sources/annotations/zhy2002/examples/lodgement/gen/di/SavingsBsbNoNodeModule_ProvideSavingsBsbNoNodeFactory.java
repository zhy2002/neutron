package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SavingsBsbNoNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsBsbNoNodeModule_ProvideSavingsBsbNoNodeFactory
    implements Factory<SavingsBsbNoNode> {
  private final SavingsBsbNoNodeModule module;

  public SavingsBsbNoNodeModule_ProvideSavingsBsbNoNodeFactory(SavingsBsbNoNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SavingsBsbNoNode get() {
    return Preconditions.checkNotNull(
        module.provideSavingsBsbNoNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SavingsBsbNoNode> create(SavingsBsbNoNodeModule module) {
    return new SavingsBsbNoNodeModule_ProvideSavingsBsbNoNodeFactory(module);
  }

  /** Proxies {@link SavingsBsbNoNodeModule#provideSavingsBsbNoNode()}. */
  public static SavingsBsbNoNode proxyProvideSavingsBsbNoNode(SavingsBsbNoNodeModule instance) {
    return instance.provideSavingsBsbNoNode();
  }
}
