package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherIncomePreviousYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomePreviousYearNodeModule_ProvideOtherIncomePreviousYearNodeFactory
    implements Factory<OtherIncomePreviousYearNode> {
  private final OtherIncomePreviousYearNodeModule module;

  public OtherIncomePreviousYearNodeModule_ProvideOtherIncomePreviousYearNodeFactory(
      OtherIncomePreviousYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherIncomePreviousYearNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherIncomePreviousYearNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherIncomePreviousYearNode> create(
      OtherIncomePreviousYearNodeModule module) {
    return new OtherIncomePreviousYearNodeModule_ProvideOtherIncomePreviousYearNodeFactory(module);
  }

  /** Proxies {@link OtherIncomePreviousYearNodeModule#provideOtherIncomePreviousYearNode()}. */
  public static OtherIncomePreviousYearNode proxyProvideOtherIncomePreviousYearNode(
      OtherIncomePreviousYearNodeModule instance) {
    return instance.provideOtherIncomePreviousYearNode();
  }
}
