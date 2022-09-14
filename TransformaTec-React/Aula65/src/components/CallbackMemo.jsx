import React, { useMemo, useCallback } from 'react';

export default function CallbackMemo() {


    const doCallback = useCallback(() => {
        console.log('useCallback')
      }, []);

      const doMemo = useMemo(() => {
        console.log('useMemo')
      }, []);

      return (
        <div>
          <button onClick={() => doCallback()}>Executar callBack</button>
        </div>
      )

}