package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SpouseNodeModule_ProvideStringUiNodeFactory implements Factory<StringUiNode<?>> {
  private final SpouseNodeModule module;

  public SpouseNodeModule_ProvideStringUiNodeFactory(SpouseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(SpouseNodeModule module) {
    return new SpouseNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link SpouseNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(SpouseNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
