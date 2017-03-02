package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PreviousEmploymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentNodeModule_ProvidePreviousEmploymentNodeFactory
    implements Factory<PreviousEmploymentNode> {
  private final PreviousEmploymentNodeModule module;

  public PreviousEmploymentNodeModule_ProvidePreviousEmploymentNodeFactory(
      PreviousEmploymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PreviousEmploymentNode get() {
    return Preconditions.checkNotNull(
        module.providePreviousEmploymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PreviousEmploymentNode> create(PreviousEmploymentNodeModule module) {
    return new PreviousEmploymentNodeModule_ProvidePreviousEmploymentNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentNodeModule#providePreviousEmploymentNode()}. */
  public static PreviousEmploymentNode proxyProvidePreviousEmploymentNode(
      PreviousEmploymentNodeModule instance) {
    return instance.providePreviousEmploymentNode();
  }
}
