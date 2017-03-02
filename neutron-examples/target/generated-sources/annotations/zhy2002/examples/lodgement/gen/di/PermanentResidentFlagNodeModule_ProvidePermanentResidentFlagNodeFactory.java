package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PermanentResidentFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PermanentResidentFlagNodeModule_ProvidePermanentResidentFlagNodeFactory
    implements Factory<PermanentResidentFlagNode> {
  private final PermanentResidentFlagNodeModule module;

  public PermanentResidentFlagNodeModule_ProvidePermanentResidentFlagNodeFactory(
      PermanentResidentFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PermanentResidentFlagNode get() {
    return Preconditions.checkNotNull(
        module.providePermanentResidentFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PermanentResidentFlagNode> create(PermanentResidentFlagNodeModule module) {
    return new PermanentResidentFlagNodeModule_ProvidePermanentResidentFlagNodeFactory(module);
  }

  /** Proxies {@link PermanentResidentFlagNodeModule#providePermanentResidentFlagNode()}. */
  public static PermanentResidentFlagNode proxyProvidePermanentResidentFlagNode(
      PermanentResidentFlagNodeModule instance) {
    return instance.providePermanentResidentFlagNode();
  }
}
