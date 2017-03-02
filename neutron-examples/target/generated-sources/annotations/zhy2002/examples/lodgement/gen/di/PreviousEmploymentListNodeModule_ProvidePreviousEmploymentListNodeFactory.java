package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PreviousEmploymentListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNodeModule_ProvidePreviousEmploymentListNodeFactory
    implements Factory<PreviousEmploymentListNode> {
  private final PreviousEmploymentListNodeModule module;

  public PreviousEmploymentListNodeModule_ProvidePreviousEmploymentListNodeFactory(
      PreviousEmploymentListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PreviousEmploymentListNode get() {
    return Preconditions.checkNotNull(
        module.providePreviousEmploymentListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PreviousEmploymentListNode> create(
      PreviousEmploymentListNodeModule module) {
    return new PreviousEmploymentListNodeModule_ProvidePreviousEmploymentListNodeFactory(module);
  }

  /** Proxies {@link PreviousEmploymentListNodeModule#providePreviousEmploymentListNode()}. */
  public static PreviousEmploymentListNode proxyProvidePreviousEmploymentListNode(
      PreviousEmploymentListNodeModule instance) {
    return instance.providePreviousEmploymentListNode();
  }
}
