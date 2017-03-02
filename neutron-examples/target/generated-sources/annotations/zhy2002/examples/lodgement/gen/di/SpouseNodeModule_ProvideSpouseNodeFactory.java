package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.SpouseNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SpouseNodeModule_ProvideSpouseNodeFactory implements Factory<SpouseNode> {
  private final SpouseNodeModule module;

  public SpouseNodeModule_ProvideSpouseNodeFactory(SpouseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SpouseNode get() {
    return Preconditions.checkNotNull(
        module.provideSpouseNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SpouseNode> create(SpouseNodeModule module) {
    return new SpouseNodeModule_ProvideSpouseNodeFactory(module);
  }

  /** Proxies {@link SpouseNodeModule#provideSpouseNode()}. */
  public static SpouseNode proxyProvideSpouseNode(SpouseNodeModule instance) {
    return instance.provideSpouseNode();
  }
}
