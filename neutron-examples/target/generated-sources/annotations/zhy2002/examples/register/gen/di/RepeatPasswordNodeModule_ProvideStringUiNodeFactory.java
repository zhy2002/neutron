package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepeatPasswordNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final RepeatPasswordNodeModule module;

  public RepeatPasswordNodeModule_ProvideStringUiNodeFactory(RepeatPasswordNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(RepeatPasswordNodeModule module) {
    return new RepeatPasswordNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link RepeatPasswordNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(RepeatPasswordNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
