package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.RepeatPasswordNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepeatPasswordNodeModule_ProvideRepeatPasswordNodeFactory
    implements Factory<RepeatPasswordNode> {
  private final RepeatPasswordNodeModule module;

  public RepeatPasswordNodeModule_ProvideRepeatPasswordNodeFactory(
      RepeatPasswordNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RepeatPasswordNode get() {
    return Preconditions.checkNotNull(
        module.provideRepeatPasswordNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RepeatPasswordNode> create(RepeatPasswordNodeModule module) {
    return new RepeatPasswordNodeModule_ProvideRepeatPasswordNodeFactory(module);
  }

  /** Proxies {@link RepeatPasswordNodeModule#provideRepeatPasswordNode()}. */
  public static RepeatPasswordNode proxyProvideRepeatPasswordNode(
      RepeatPasswordNodeModule instance) {
    return instance.provideRepeatPasswordNode();
  }
}
