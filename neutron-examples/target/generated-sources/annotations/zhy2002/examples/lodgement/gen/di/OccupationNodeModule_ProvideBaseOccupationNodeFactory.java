package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseOccupationNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OccupationNodeModule_ProvideBaseOccupationNodeFactory
    implements Factory<BaseOccupationNode<?>> {
  private final OccupationNodeModule module;

  public OccupationNodeModule_ProvideBaseOccupationNodeFactory(OccupationNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseOccupationNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseOccupationNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseOccupationNode<?>> create(OccupationNodeModule module) {
    return new OccupationNodeModule_ProvideBaseOccupationNodeFactory(module);
  }

  /** Proxies {@link OccupationNodeModule#provideBaseOccupationNode()}. */
  public static BaseOccupationNode<?> proxyProvideBaseOccupationNode(
      OccupationNodeModule instance) {
    return instance.provideBaseOccupationNode();
  }
}
