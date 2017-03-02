package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MaritalStatusNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MaritalStatusNodeModule_ProvideMaritalStatusNodeFactory
    implements Factory<MaritalStatusNode> {
  private final MaritalStatusNodeModule module;

  public MaritalStatusNodeModule_ProvideMaritalStatusNodeFactory(MaritalStatusNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MaritalStatusNode get() {
    return Preconditions.checkNotNull(
        module.provideMaritalStatusNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MaritalStatusNode> create(MaritalStatusNodeModule module) {
    return new MaritalStatusNodeModule_ProvideMaritalStatusNodeFactory(module);
  }

  /** Proxies {@link MaritalStatusNodeModule#provideMaritalStatusNode()}. */
  public static MaritalStatusNode proxyProvideMaritalStatusNode(MaritalStatusNodeModule instance) {
    return instance.provideMaritalStatusNode();
  }
}
