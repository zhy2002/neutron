package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OwnedOutrightFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnedOutrightFlagNodeModule_ProvideOwnedOutrightFlagNodeFactory
    implements Factory<OwnedOutrightFlagNode> {
  private final OwnedOutrightFlagNodeModule module;

  public OwnedOutrightFlagNodeModule_ProvideOwnedOutrightFlagNodeFactory(
      OwnedOutrightFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OwnedOutrightFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideOwnedOutrightFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OwnedOutrightFlagNode> create(OwnedOutrightFlagNodeModule module) {
    return new OwnedOutrightFlagNodeModule_ProvideOwnedOutrightFlagNodeFactory(module);
  }

  /** Proxies {@link OwnedOutrightFlagNodeModule#provideOwnedOutrightFlagNode()}. */
  public static OwnedOutrightFlagNode proxyProvideOwnedOutrightFlagNode(
      OwnedOutrightFlagNodeModule instance) {
    return instance.provideOwnedOutrightFlagNode();
  }
}
