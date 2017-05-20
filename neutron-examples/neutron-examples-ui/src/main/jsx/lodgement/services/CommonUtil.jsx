import Promise from 'promise';
import moment from 'moment';

let loadingCount = 0;

const excludedNodeNames = ['addressRefListNode', 'errorListNode'];

function isExcluded(nodeName) {
    return excludedNodeNames.indexOf(nodeName) >= 0;
}

function delay(interval = 0) {
    return new Promise(
        (resolve) => {
            setTimeout(resolve, interval);
        }
    );
}

function defer(data) {
    return new Promise(
        (resolve) => {
            setTimeout(() => resolve(data), 50);
        }
    );
}

function toLocalId(uniqueId) {
    const index = uniqueId.indexOf('-');
    return uniqueId.substring(index + 1);
}

function setIsLoading(isLoading) {
    const items = document.getElementsByClassName('loading-spinner-component');
    if (items.length === 0)
        return;
    loadingCount += isLoading ? 1 : -1;
    const spinner = items.item(0);
    if (loadingCount === 1) {
        spinner.classList.remove('hide');
    } else if (loadingCount === 0) {
        spinner.classList.add('hide');
    }
    console.debug(`IsLoading: ${isLoading}`);
}

function extractValue(node) {
    if (!node)
        return null;

    if (node.getChildCount) {
        return extractObject(node);
    } else if (node.getItemCount) {
        return extractList(node);
    }
    return extractLeaf(node);
}

function extractObject(node) {
    const result = {};
    const children = node.getChildren();
    children.forEach((child) => {
        if (child.getNodeStatus() === GWT.NodeStatusEnum.Loaded && !isExcluded(child.getName())) {
            let fieldName = child.getName();
            //todo duplicate of clean up function
            if (fieldName.endsWith('Node')) {
                fieldName = fieldName.substr(0, fieldName.length - 4);
            }
            result[fieldName] = extractValue(child);
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

function setValue(node, obj) {
    if (!obj)
        return;

    if (node.getChildCount) {
        setObject(node, obj);
    } else if (node.getItemCount) {
        setList(node, obj);
    } else if (node.setValue) {
        setLeaf(node, obj);
    }
}

function setObject(node, obj) {
    const data = obj.children || {};
    const children = node.getChildren();

    children.forEach((child) => {
        if (!isExcluded(child.getName())) {
            let fieldName = child.getName();
            if (fieldName.endsWith('Node')) {
                fieldName = fieldName.substr(0, fieldName.length - 4);
            }
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

function replaceDigit(c, i, a) {
    return i && c !== '.' && ((a.length - i) % 3 === 0) ? `,${c}` : c;
}

function formatCurrency(n, symbol) {
    if (n === null || n === undefined)
        return '';
    const s = symbol || '$';
    return s + n.toFixed(2).replace(/./g, replaceDigit);
}

function formatDate(date) {
    if (!date)
        return '';

    return moment.utc(date).local().format('YYYY-MM-DD HH:mm:ss');
}

export default class CommonUtil {
}

CommonUtil.extractValue = extractValue;
CommonUtil.setValue = setValue;
CommonUtil.setIsLoading = setIsLoading;
CommonUtil.delay = delay;
CommonUtil.defer = defer;
CommonUtil.formatCurrency = formatCurrency;
CommonUtil.formatDate = formatDate;
