package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetListNodeItemProvider_MembersInjector
    implements MembersInjector<OtherAssetListNodeItemProvider> {
  private final MembersInjector<OtherAssetNode> otherAssetNodeInjectorMembersInjector;

  public OtherAssetListNodeItemProvider_MembersInjector(
      MembersInjector<OtherAssetNode> otherAssetNodeInjectorMembersInjector) {
    assert otherAssetNodeInjectorMembersInjector != null;
    this.otherAssetNodeInjectorMembersInjector = otherAssetNodeInjectorMembersInjector;
  }

  public static MembersInjector<OtherAssetListNodeItemProvider> create(
      MembersInjector<OtherAssetNode> otherAssetNodeInjectorMembersInjector) {
    return new OtherAssetListNodeItemProvider_MembersInjector(
        otherAssetNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(OtherAssetListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.otherAssetNodeInjector = otherAssetNodeInjectorMembersInjector;
  }

  public static void injectOtherAssetNodeInjector(
      OtherAssetListNodeItemProvider instance,
      MembersInjector<OtherAssetNode> otherAssetNodeInjector) {
    instance.otherAssetNodeInjector = otherAssetNodeInjector;
  }
}
