import{options as n}from"preact";let t,o,c,u=0,i=[],r=n.__b,e=n.__r,f=n.diffed,s=n.__c,l=n.unmount;function a(t,c){n.__h&&n.__h(o,t,u||c),u=0;const i=o.__H||(o.__H={__:[],__h:[]});return t>=i.__.length&&i.__.push({}),i.__[t]}function m(n){return u=1,p(z,n)}function p(n,c,u){const i=a(t++,2);return i.t=n,i.__c||(i.__=[u?u(c):z(void 0,c),n=>{const t=i.t(i.__[0],n);i.__[0]!==t&&(i.__=[t,i.__[1]],i.__c.setState({}))}],i.__c=o),i.__}function y(c,u){const i=a(t++,3);!n.__s&&w(i.__H,u)&&(i.__=c,i.__H=u,o.__H.__h.push(i))}function h(c,u){const i=a(t++,4);!n.__s&&w(i.__H,u)&&(i.__=c,i.__H=u,null==o.__i.__h&&(o.__i.__h=[]),o.__i.__h.push(i))}function _(n){return u=5,v(()=>({current:n}),[])}function d(n,t,o){u=6,h(()=>{"function"==typeof n?n(t()):n&&(n.current=t())},null==o?o:o.concat(n))}function v(n,o){const c=a(t++,7);return w(c.__H,o)&&(c.__=n(),c.__H=o,c.__h=n),c.__}function A(n,t){return u=8,v(()=>n,t)}function F(n){const c=o.context[n.__c],u=a(t++,9);return u.__c=n,c?(null==u.__&&(u.__=!0,c.sub(o)),c.props.value):n.__}function T(t,o){n.useDebugValue&&n.useDebugValue(o?o(t):t)}function q(n){const c=a(t++,10),u=m();return c.__=n,o.componentDidCatch||(o.componentDidCatch=n=>{c.__&&c.__(n),u[1](n)}),[u[0],()=>{u[1](void 0)}]}function x(){i.forEach(t=>{if(2048&~t.__i.__f)try{t.__H.__h.forEach(j),t.__H.__h.forEach(k),t.__H.__h=[]}catch(o){t.__H.__h=[],n.__e(o,t.__i)}}),i=[]}n.__b=(n,t)=>{o=null,r&&r(n,t)},n.__r=n=>{e&&e(n),o=n.__c,t=0;const c=o.__H;c&&(c.__h.forEach(j),c.__h.forEach(k),c.__h=[])},n.diffed=t=>{f&&f(t);const u=t.__c;u&&u.__H&&u.__H.__h.length&&(1!==i.push(u)&&c===n.requestAnimationFrame||(c=n.requestAnimationFrame,(c||g)(x))),o=void 0},n.__c=(t,o)=>{o.some(t=>{try{t.__h.forEach(j),t.__h=t.__h.filter(n=>!n.__||k(n))}catch(c){o.some(n=>{n.__h&&(n.__h=[])}),o=[],n.__e(c,t)}}),s&&s(t,o)},n.unmount=t=>{l&&l(t);const o=t.__c;if(o&&o.__H)try{o.__H.__.forEach(j)}catch(t){n.__e(t,o.__i)}};let b="function"==typeof requestAnimationFrame;function g(n){const t=()=>{clearTimeout(o),b&&cancelAnimationFrame(c),setTimeout(n)},o=setTimeout(t,100);let c;b&&(c=requestAnimationFrame(t))}function j(n){const t=o;"function"==typeof n.__c&&n.__c(),o=t}function k(n){const t=o;n.__c=n.__(),o=t}function w(n,t){return!n||n.length!==t.length||t.some((t,o)=>t!==n[o])}function z(n,t){return"function"==typeof t?t(n):t}export{A as useCallback,F as useContext,T as useDebugValue,y as useEffect,q as useErrorBoundary,d as useImperativeHandle,h as useLayoutEffect,v as useMemo,p as useReducer,_ as useRef,m as useState};
//# sourceMappingURL=hooks.modern.js.map