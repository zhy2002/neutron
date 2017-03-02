package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNodeModule_ProvideSelectRelatedPersonNodeFactory
    implements Factory<SelectRelatedPersonNode> {
  private final SelectRelatedPersonNodeModule module;

  public SelectRelatedPersonNodeModule_ProvideSelectRelatedPersonNodeFactory(
      SelectRelatedPersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SelectRelatedPersonNode get() {
    return Preconditions.checkNotNull(
        module.provideSelectRelatedPersonNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SelectRelatedPersonNode> create(SelectRelatedPersonNodeModule module) {
    return new SelectRelatedPersonNodeModule_ProvideSelectRelatedPersonNodeFactory(module);
  }

  /** Proxies {@link SelectRelatedPersonNodeModule#provideSelectRelatedPersonNode()}. */
  public static SelectRelatedPersonNode proxyProvideSelectRelatedPersonNode(
      SelectRelatedPersonNodeModule instance) {
    return instance.provideSelectRelatedPersonNode();
  }
}
