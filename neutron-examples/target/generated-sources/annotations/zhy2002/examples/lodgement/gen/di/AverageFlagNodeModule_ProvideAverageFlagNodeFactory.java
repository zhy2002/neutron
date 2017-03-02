package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AverageFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AverageFlagNodeModule_ProvideAverageFlagNodeFactory
    implements Factory<AverageFlagNode> {
  private final AverageFlagNodeModule module;

  public AverageFlagNodeModule_ProvideAverageFlagNodeFactory(AverageFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AverageFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideAverageFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AverageFlagNode> create(AverageFlagNodeModule module) {
    return new AverageFlagNodeModule_ProvideAverageFlagNodeFactory(module);
  }

  /** Proxies {@link AverageFlagNodeModule#provideAverageFlagNode()}. */
  public static AverageFlagNode proxyProvideAverageFlagNode(AverageFlagNodeModule instance) {
    return instance.provideAverageFlagNode();
  }
}
