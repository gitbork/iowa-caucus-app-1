package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.0.1 */
final class zzhj implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzgt zzb;

    zzhj(zzgt zzgt, AtomicReference atomicReference) {
        this.zzb = zzgt;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Double.valueOf(this.zzb.zzt().zzc(this.zzb.zzg().zzab(), zzak.zzao)));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
