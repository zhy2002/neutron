import Promise from 'promise';
import StaticService from './StaticService';


function toLocalId(uniqueId) {
    const index = uniqueId.indexOf('-');
    return uniqueId.substring(index + 1);
}

function extractValue(node, excluded) {
    if (!node)
        return null;

    if (node.getChildCount) {
        return extractObject(node, excluded);
    } else if (node.getItemCount) {
        return extractList(node);
    }
    return extractLeaf(node);
}

function extractObject(node, excluded) {
    const excludedNodeNames = excluded || [];

    const result = {};
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded) {
            const nodeName = child.getName();
            if (excludedNodeNames.indexOf(nodeName) < 0) {
                const fieldName = CommonUtil.toFieldName(nodeName);
                result[fieldName] = extractValue(child);
            }
        }
    });
    return {
        $id: toLocalId(node.getUniqueId()),
        children: result
    };
}

function extractList(node) {
    const result = {};
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded) {
            result[child.getName()] = extractValue(child);
        }
    });
    return {
        $id: toLocalId(node.getUniqueId()),
        children: result
    };
}

function extractLeaf(node) {
    let value = node.getValue();
    if (node.getText) { //big decimal node
        const text = node.getText();
        value = text ? parseFloat(text) : null;
    }
    return {
        $id: toLocalId(node.getUniqueId()),
        value
    };
}

function setValue(node, obj, excluded) {
    if (!obj)
        return;

    if (node.getChildCount) {
        setObject(node, obj, excluded);
    } else if (node.getItemCount) {
        setList(node, obj);
    } else if (node.setValue) {
        setLeaf(node, obj);
    }
}

function setObject(node, obj, excluded) {
    const data = obj.children || {};
    const excludedNodeNames = excluded || [];
    const children = node.getChildren();

    children.forEach((child) => {
        const nodeName = child.getName();
        if (excludedNodeNames.indexOf(nodeName) < 0) {
            const fieldName = CommonUtil.toFieldName(nodeName);
            if (data[fieldName]) {
                setValue(child, data[fieldName]);
            }
        }
    });
}

function setList(node, obj) {
    const data = obj.children || {};
    if (!data)
        return;

    for (const key in data) {
        if (Object.prototype.hasOwnProperty.call(data, key)) {
            //todo sort key first
            const item = data[key];
            if (item) {
                let child = node.getItemByName(key);
                if (!child) {
                    child = node.createItemWithName(key);
                }
                setValue(child, item);
            }
        }
    }
}

function setLeaf(node, obj) {
    const data = obj.value;

    if (node.setText) { //big decimal node
        if (data !== null) {
            node.setText(`${data}`);
        }
    } else {
        try {
            const value = node.getCopyOfValue();
            copyFields(value, data);
            node.setValue(value);
        } catch (e) {
            node.setValue(data);
        }
    }
}

function copyFields(target, source) {
    //todo deep copy
    for (const prop in source) {
        if (source[prop]) {
            target[prop] = source[prop];
        }
    }
}

export default class CommonUtil extends StaticService {

    static extractValue(node, excluded) {
        return extractValue(node, excluded);
    }

    static setValue(node, obj) {
        setValue(node, obj);
    }

    static defer(data) {
        return new Promise(
            (resolve) => {
                setTimeout(() => resolve(data), 50);
            }
        );
    }

    static delay(interval = 0) {
        return new Promise(
            (resolve) => {
                setTimeout(resolve, interval);
            }
        );
    }

    static toFieldName(nodeName) {
        return CommonUtil.removeTrailing(nodeName, 'Node');
    }

    static removeTrailing(str, tail) {
        if (str && str.endsWith(tail)) {
            return str.substr(0, str.length - tail.length);
        }
        return str;
    }

    static noOp() {}
}
