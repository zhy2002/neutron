package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.UsageNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsageNodeModule_ProvideUsageNodeFactory implements Factory<UsageNode> {
  private final UsageNodeModule module;

  public UsageNodeModule_ProvideUsageNodeFactory(UsageNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UsageNode get() {
    return Preconditions.checkNotNull(
        module.provideUsageNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UsageNode> create(UsageNodeModule module) {
    return new UsageNodeModule_ProvideUsageNodeFactory(module);
  }

  /** Proxies {@link UsageNodeModule#provideUsageNode()}. */
  public static UsageNode proxyProvideUsageNode(UsageNodeModule instance) {
    return instance.provideUsageNode();
  }
}
