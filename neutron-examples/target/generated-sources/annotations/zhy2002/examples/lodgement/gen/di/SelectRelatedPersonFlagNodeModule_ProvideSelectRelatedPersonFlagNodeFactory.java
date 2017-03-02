package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonFlagNodeModule_ProvideSelectRelatedPersonFlagNodeFactory
    implements Factory<SelectRelatedPersonFlagNode> {
  private final SelectRelatedPersonFlagNodeModule module;

  public SelectRelatedPersonFlagNodeModule_ProvideSelectRelatedPersonFlagNodeFactory(
      SelectRelatedPersonFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectRelatedPersonFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideSelectRelatedPersonFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectRelatedPersonFlagNode> create(
      SelectRelatedPersonFlagNodeModule module) {
    return new SelectRelatedPersonFlagNodeModule_ProvideSelectRelatedPersonFlagNodeFactory(module);
  }

  /** Proxies {@link SelectRelatedPersonFlagNodeModule#provideSelectRelatedPersonFlagNode()}. */
  public static SelectRelatedPersonFlagNode proxyProvideSelectRelatedPersonFlagNode(
      SelectRelatedPersonFlagNodeModule instance) {
    return instance.provideSelectRelatedPersonFlagNode();
  }
}
