package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OccupationNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OccupationNodeModule_ProvideOccupationNodeFactory
    implements Factory<OccupationNode> {
  private final OccupationNodeModule module;

  public OccupationNodeModule_ProvideOccupationNodeFactory(OccupationNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OccupationNode get() {
    return Preconditions.checkNotNull(
        module.provideOccupationNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OccupationNode> create(OccupationNodeModule module) {
    return new OccupationNodeModule_ProvideOccupationNodeFactory(module);
  }

  /** Proxies {@link OccupationNodeModule#provideOccupationNode()}. */
  public static OccupationNode proxyProvideOccupationNode(OccupationNodeModule instance) {
    return instance.provideOccupationNode();
  }
}
