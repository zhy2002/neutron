package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetNodeChildProvider_MembersInjector
    implements MembersInjector<OtherAssetNodeChildProvider> {
  private final MembersInjector<OtherAssetDescriptionNode>
      otherAssetDescriptionNodeInjectorMembersInjector;

  private final MembersInjector<OtherAssetTypeNode> otherAssetTypeNodeInjectorMembersInjector;

  private final MembersInjector<OtherAssetMarketValueNode>
      otherAssetMarketValueNodeInjectorMembersInjector;

  public OtherAssetNodeChildProvider_MembersInjector(
      MembersInjector<OtherAssetDescriptionNode> otherAssetDescriptionNodeInjectorMembersInjector,
      MembersInjector<OtherAssetTypeNode> otherAssetTypeNodeInjectorMembersInjector,
      MembersInjector<OtherAssetMarketValueNode> otherAssetMarketValueNodeInjectorMembersInjector) {
    assert otherAssetDescriptionNodeInjectorMembersInjector != null;
    this.otherAssetDescriptionNodeInjectorMembersInjector =
        otherAssetDescriptionNodeInjectorMembersInjector;
    assert otherAssetTypeNodeInjectorMembersInjector != null;
    this.otherAssetTypeNodeInjectorMembersInjector = otherAssetTypeNodeInjectorMembersInjector;
    assert otherAssetMarketValueNodeInjectorMembersInjector != null;
    this.otherAssetMarketValueNodeInjectorMembersInjector =
        otherAssetMarketValueNodeInjectorMembersInjector;
  }

  public static MembersInjector<OtherAssetNodeChildProvider> create(
      MembersInjector<OtherAssetDescriptionNode> otherAssetDescriptionNodeInjectorMembersInjector,
      MembersInjector<OtherAssetTypeNode> otherAssetTypeNodeInjectorMembersInjector,
      MembersInjector<OtherAssetMarketValueNode> otherAssetMarketValueNodeInjectorMembersInjector) {
    return new OtherAssetNodeChildProvider_MembersInjector(
        otherAssetDescriptionNodeInjectorMembersInjector,
        otherAssetTypeNodeInjectorMembersInjector,
        otherAssetMarketValueNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(OtherAssetNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.otherAssetDescriptionNodeInjector = otherAssetDescriptionNodeInjectorMembersInjector;
    instance.otherAssetTypeNodeInjector = otherAssetTypeNodeInjectorMembersInjector;
    instance.otherAssetMarketValueNodeInjector = otherAssetMarketValueNodeInjectorMembersInjector;
  }

  public static void injectOtherAssetDescriptionNodeInjector(
      OtherAssetNodeChildProvider instance,
      MembersInjector<OtherAssetDescriptionNode> otherAssetDescriptionNodeInjector) {
    instance.otherAssetDescriptionNodeInjector = otherAssetDescriptionNodeInjector;
  }

  public static void injectOtherAssetTypeNodeInjector(
      OtherAssetNodeChildProvider instance,
      MembersInjector<OtherAssetTypeNode> otherAssetTypeNodeInjector) {
    instance.otherAssetTypeNodeInjector = otherAssetTypeNodeInjector;
  }

  public static void injectOtherAssetMarketValueNodeInjector(
      OtherAssetNodeChildProvider instance,
      MembersInjector<OtherAssetMarketValueNode> otherAssetMarketValueNodeInjector) {
    instance.otherAssetMarketValueNodeInjector = otherAssetMarketValueNodeInjector;
  }
}
