import React from "react";


function extractValue(node) {
    if (!node)
        return undefined;

    if (node["getChildCount"]) {
        return extractObject(node);
    } else if (node["getItemCount"]) {
        return extractList(node);
    } else {
        return extractLeaf(node);
    }
}

function extractObject(node) {
    const result = {};
    const children = node.getChildren();
    children.forEach(child => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded && child.getName() != "errorListNode") {
            let fieldName = child.getName();
            if (fieldName.endsWith("Node")) {
                fieldName = fieldName.substr(0, fieldName.length - 4);
            }
            result[fieldName] = extractValue(child);
        }
    });
    return result;
}

function extractList(node) {
    const result = [];
    const children = node.getChildren();
    children.forEach(child => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded) {
            result.push(extractValue(child));
        }
    });
    return result;
}

function extractLeaf(node) {
    let value = node.getValue();
    if (node["getText"]) { //big decimal node
        let text = node.getText();
        if (text) {
            value = parseFloat(text);
        } else {
            value = null;
        }
    }
    return value;
}

export default class CommonUtil {

}

CommonUtil.extractValue = extractValue;
